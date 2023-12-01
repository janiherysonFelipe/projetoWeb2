package imd.ufrn.universidade_ufrn.service;

import imd.ufrn.universidade_ufrn.repository.FaculdadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaculdadeService {

    @Autowired
    FaculdadeRepository repository;

}
