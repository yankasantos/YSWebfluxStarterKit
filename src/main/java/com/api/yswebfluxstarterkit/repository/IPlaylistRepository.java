package com.api.yswebfluxstarterkit.repository;

import com.api.yswebfluxstarterkit.document.Playlist;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IPlaylistRepository extends ReactiveMongoRepository<Playlist, String> {


}
