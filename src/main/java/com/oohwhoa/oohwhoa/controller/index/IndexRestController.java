package com.oohwhoa.oohwhoa.controller.index;

import com.oohwhoa.oohwhoa.service.index.IndexService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController()
public class IndexRestController {

  private IndexService indexService;

  public IndexRestController(IndexService indexService) {
    this.indexService = indexService;
  }

//  @GetMapping("/all-data")
//  public void getAllData() throws IOException {
//    indexService.getAllData();
//  }

}
