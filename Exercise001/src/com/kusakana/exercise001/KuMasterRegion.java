package com.kusakana.exercise001;

import com.kusakana.exercise001.objects.ShipObj;
import com.negrorevolutio.nereengine.asm.objects.KuASMObject;
import com.negrorevolutio.nereengine.asm.scenes.KuASMRegion;
import com.negrorevolutio.nereengine.asm.scenes.KuASMScene;
public abstract class KuMasterRegion extends KuASMRegion
{
	public KuMasterRegion(KuASMScene Scene)
	{
		super(Scene);
	}

	@Override
	protected KuASMObject WhichObject(String Kind)
	{
		KuASMObject Obj = null;
		if(Kind == "Ship"){
			Obj = new ShipObj(this);
		}
		return Obj;
	}
}
