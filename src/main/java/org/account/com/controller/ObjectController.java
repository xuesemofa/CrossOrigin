package org.account.com.controller;

import org.account.com.model.ObjectModel;
import org.account.com.service.ObjService;
import org.account.com.util.resultJson.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*",maxAge = 600)
public class ObjectController {

    @Autowired
    private ObjService objService;

    @GetMapping("/getDatas")
    public @ResponseBody ResponseResult<List<ObjectModel>> getDatas() {
        List<ObjectModel> list = objService.findAll();
        ResponseResult<List<ObjectModel>> result = new ResponseResult<>();
        if (list != null && list.size() > 0) {
            result.setSuccess(true);
            result.setData(list);
        } else
            result.setSuccess(false);
        return result;
    }
}
