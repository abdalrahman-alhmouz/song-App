package com.songr.songr;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface AlbumReposity extends JpaRepository<Album,Integer> {

}
