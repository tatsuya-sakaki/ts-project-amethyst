package com.ts.amethyst.logic;

import java.util.List;

public interface ContentTypeDao {
    List<ContentType> findAll();
    ContentType findById(Integer contentTypeId);
}
