package negocio;

import java.util.List;

public interface CrudGenerico<J, Pk>{
	
	int insertOne(J obj);

	int update(J obj);

	int deleteOne(Pk ObjId);
	
	List<J> findAll();
	
	J findbyId(Pk ObjId);
	
}
