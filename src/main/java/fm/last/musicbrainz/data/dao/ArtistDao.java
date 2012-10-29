/*
 * Copyright 2012 The musicbrainz-data Authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package fm.last.musicbrainz.data.dao;

import java.util.List;

import fm.last.musicbrainz.data.model.Artist;

/**
 * Provides access to {@link Artist}s.
 */
public interface ArtistDao extends MusicBrainzDao<Artist> {

  /**
   * Ignores the casing of {@code name}.
   * 
   * @return Empty list when no {@link Artist}s are found
   */
  public List<Artist> getByName(String name);

}