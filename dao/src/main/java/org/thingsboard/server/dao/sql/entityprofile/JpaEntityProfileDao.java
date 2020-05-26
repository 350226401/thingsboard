/**
 * Copyright © 2016-2020 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.dao.sql.entityprofile;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.thingsboard.server.common.data.entityprofile.EntityProfile;
import org.thingsboard.server.dao.entityprofile.EntityProfileDao;
import org.thingsboard.server.dao.model.sql.EntityProfileEntity;
import org.thingsboard.server.dao.sql.JpaAbstractDao;
import org.thingsboard.server.dao.util.SqlDao;

@Component
@SqlDao
@RequiredArgsConstructor
public class JpaEntityProfileDao extends JpaAbstractDao<EntityProfileEntity, EntityProfile> implements EntityProfileDao {
    private final EntityProfileRepository repository;

    @Override
    protected Class<EntityProfileEntity> getEntityClass() {
        return EntityProfileEntity.class;
    }

    @Override
    protected CrudRepository<EntityProfileEntity, String> getCrudRepository() {
        return repository;
    }
}
