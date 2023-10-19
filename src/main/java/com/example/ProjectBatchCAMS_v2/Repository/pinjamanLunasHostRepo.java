package com.example.ProjectBatchCAMS_v2.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ProjectBatchCAMS_v2.Model.pinjamanLunasHostModel;

@Repository
public interface pinjamanLunasHostRepo extends JpaRepository<pinjamanLunasHostModel, Long>{

}
