package org.micromall.order.interfaces;

import java.util.List;

import org.micromall.order.exception.MyNotDeleteException;
import org.micromall.order.exception.MyNotFoundException;
import org.micromall.order.exception.MyNotSaveException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IDaoService<E, DTO, CREQ, UREQ, ID> {

    DTO create(CREQ request) throws MyNotSaveException;

    DTO update(UREQ request,ID id) throws MyNotSaveException;

    DTO fetchById(ID id) throws MyNotFoundException;

    void delete(ID id) throws MyNotDeleteException;

    List<DTO> fetchList();

    Page<DTO> fetchAll(Pageable pageable);

    Page<DTO> search(String keyword, Pageable pageable);

}
