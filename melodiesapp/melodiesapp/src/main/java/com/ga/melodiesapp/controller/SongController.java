package com.ga.melodiesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ga.melodiesapp.dao.SongDao;
import com.ga.melodiesapp.model.Song;

@RestController
public class SongController {
	@Autowired
	private SongDao dao;

	// HTTP POST REQUEST - Song Add
	@PostMapping("/song/add")
	public Song addSong(@RequestBody Song song) {
		dao.save(song);
		return song;
	}

	// HTTP GET REQUEST - Song Index
	@GetMapping("/song/index")
	public Iterable<Song> getSong() {
		var it = dao.findAll();
		return it;
	}

	// HTTP GET REQUEST - Song Detail
	@GetMapping("/song/detail")
	public Song songDetails(@RequestParam int id) {
		System.out.println(id);
		Song song = dao.findById(id);
		return song;
	}

	// HTTP GET REQUEST - Song Edit
	@PutMapping("/song/edit")
	public Song editSong(@RequestBody Song song) {
		dao.save(song);
		return song;
	}

	// HTTP GET REQUEST - Song Delete
	@DeleteMapping("/song/delete")
	public Song deleteSong(@RequestParam int id) {
		Song song = dao.findById(id);
		dao.deleteById(id);
		return song;
	}
}
