package com.oohwhoa.oohwhoa.controller.index;

import com.oohwhoa.oohwhoa.service.index.IndexService;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HomeRestController {

  private IndexService indexService;

  public HomeRestController(IndexService indexService) {
    this.indexService = indexService;
  }

//  @GetMapping("/all-data")
//  public void getAllData() throws IOException {
//    indexService.getAllData();
//  }

}
