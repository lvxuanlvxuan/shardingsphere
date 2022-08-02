package com.shardingsphere.controller;

import com.shardingsphere.domain.UserDO;
import com.shardingsphere.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: lvxuan
 * @program:
 * @Date: 2022/8/1 22:02
 * @Version: 1.0
 * @motto: 而后乃将图南
 * @Description: des
 * ░░░░░░░░░░░░░░░░░░░░░░░░▄░░
 * ░░░░░░░░░▐█░░░░░░░░░░░▄▀▒▌░
 * ░░░░░░░░▐▀▒█░░░░░░░░▄▀▒▒▒▐
 * ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐
 * ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐
 * ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌
 * ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒
 * ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐
 * ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄
 * ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒
 * ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒
 * You are not expected to understand this
 */
@RestController
@RequestMapping("/shardingsphere")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/queryOneById")
    public ResponseEntity queryOneById(@RequestParam("id") Integer id) {
        UserDO user = userService.queryOneById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/insertOne")
    public ResponseEntity insertOne(@RequestBody UserDO user) {
        userService.insertOne(user);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/updateById")
    public ResponseEntity updateById(@RequestBody UserDO user) {
        userService.updateById(user);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/deleteById")
    public ResponseEntity deleteById(@RequestParam("id") Integer id) {
        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
