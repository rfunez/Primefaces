package pf.beans;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

public class PfConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String val){
		System.out.println("Val " +val);
		List<ComplementBean> listComp=(List<ComplementBean>)context.getApplication().
				                                          getVariableResolver()
				                                          .resolveVariable(context, "listComp");
		for(ComplementBean cb:listComp){
			if(cb.getName().equals(val)){
				return cb;
			}
		}
		return null;		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent complement, Object val) {
		// TODO Auto-generated method stub
		System.out.println("Obj " +val);
		if(val instanceof ComplementBean ){
			return ((ComplementBean)val).getName();
		}
		return null;
	}

}
