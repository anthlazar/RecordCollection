package com.techelevator.dao;

import com.techelevator.model.Collection;
import com.techelevator.model.RecordDTO;
import com.techelevator.model.User;

import java.security.Principal;
import java.util.List;

public interface CollectionDao {
    public void addCollection(String collectionName, boolean isShare, Principal principal);

    public List<Collection> getCollections(User user);

    public void deleteCollection(Long collectionId);

    public List<RecordDTO> getRecordsByCollectionId(long collectionId);

    public String getCollectionName(long collectionId);

    public void addRecordToCollection(long recordId, long collectionId);

    public void deleteRecordFromCollection(Long recordId, Long collectionId);

    public List<Collection> getPublicCollections();



}
