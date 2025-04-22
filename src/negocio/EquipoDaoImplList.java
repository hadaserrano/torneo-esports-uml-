package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entidades.Equipo;

public class EquipoDaoImplList implements EquipoDao{

	
		private List<Equipo> list;
		public EquipoDaoImplList(){
			super();
			list = new ArrayList<>();
			cargarDatos();
		}
		
		private void cargarDatos() {
			
			list.add(new Equipo("13353655", "Sevilla Fc", LocalDate.of(1944, 10, 14)));
			list.add(new Equipo("222255", "Barcelona Fc", LocalDate.of(1935, 8, 17)));
			list.add(new Equipo("244777", "Betis Fc", LocalDate.of(1955, 9, 12)));
		}

		@Override
		public int insertOne(Equipo obj) {
			if(!list.contains(obj)) {
				list.add(obj);
				return 1;
			}
			return 0;
		}

		@Override
		public int update(Equipo obj) {
			int index = list.indexOf(obj);
			if(index != -1)
				list.set(index, obj);
			return 0;
		}

		@Override
		public int deleteOne(String ObjId) {
			for(Equipo ele : list)
				if(ele.getId().equals(ObjId)) {
					list.remove(ele);}
				return 1;
		}

		@Override
		public List<Equipo> findAll() {
			return list;
		}

		@Override
		public Equipo findbyId(String ObjId) {
			for(Equipo ele: list) {
				if(ele.getId().equals(ObjId))
					return ele;
				}
				return null;
		}

}
