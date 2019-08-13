package com.prasee.itemService.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prasee.itemService.entity.Item;

@RestController
@RequestMapping("/")
public class ItemController {
	@Autowired
	private Environment env;

	@RequestMapping("/images")
	public List<Item> getImages() {
		List<Item> images = Arrays.asList(
				new Item(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
				new Item(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
				new Item(3, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
		return images;
	}

}
