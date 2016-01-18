package tongji.zzy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tongji.zzy.dao.EmployeeDAO;
import tongji.zzy.model.EmployeeVO;

@Service
public class EmployeeManagerImpl implements EmployeeManager{
	
	@Autowired
	EmployeeDAO dao;

	public List<EmployeeVO> getAllEmployees() {
		return dao.getAllEmployees();
	}

}
