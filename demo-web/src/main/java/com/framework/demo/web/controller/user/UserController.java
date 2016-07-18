package com.framework.demo.web.controller.user;

import cn.vansky.framework.common.util.DateUtil;
import cn.vansky.framework.core.util.JsonResp;
import cn.vansky.security.ISecurity;
import cn.vansky.security.single.MD5;
import com.framework.demo.bo.user.User;
import com.framework.demo.dto.user.UserDto;
import com.framework.demo.service.user.UserService;
import com.framework.demo.vo.user.UserPageVo;
import com.framework.demo.web.controller.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA .
 * Auth: CK
 * Date: 2016/5/12
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends AbstractController {

    @Resource(name = "userService")
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        Map<String, Object> m = new HashMap<String, Object>(2);
        m.put("userName", username);
        m.put("userPassword", MD5.digest(password.getBytes()));
        User user = userService.findUserByMap(m);
        if (null != user) {
            logger.info("登录成功!!!!!!!!!!!!!!!!!");
            return JsonResp.asData().success().toJson();
        }
        return JsonResp.asData().error("用户名或密码错误").toJson();
    }

    @ResponseBody
    @RequestMapping(value = "/page/list")
    public String list(UserPageVo vo) {
        List<UserDto> l = userService.findPageUser(vo.convertPageMap());
        vo.setRows(l);
        return JsonResp.asData(vo).setDatePattern(DateUtil.yyyy_MM_dd_HH_mm_ss).toJson();
    }

    @ResponseBody
    @RequestMapping(value = "/add_user")
    public String addUser(User user) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("module", 3);
        params.put("name", user.getName());
        params.put("desc", "账户");
        String result = validation(params);
        if (result != null) {
            return result;
        }
        user.setPassword(MD5.digest(user.getPassword().getBytes()));
        user.setCreateTime(new Date());
        userService.saveEntitySelective(user);
        return JsonResp.asData().success().toJson();
    }

    @ResponseBody
    @RequestMapping(value = "/edit_user")
    public String editUser(User user) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("module", 3);
        params.put("name", user.getName());
        params.put("desc", "账户");
        params.put("id", user.getId());
        String result = validation(params);
        if (result != null) {
            return result;
        }
        userService.updateEntitySelective(user);
        return JsonResp.asData().success().toJson();
    }
}
