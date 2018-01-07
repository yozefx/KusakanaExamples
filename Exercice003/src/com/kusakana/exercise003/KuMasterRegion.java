package com.kusakana.exercise003;

import com.kusakana.exercise003.objects.ShipObj;
import com.kusakana.exercise003.objects.BlockObj;
import com.kusakana.exercise003.objects.DiamondObj;
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
		else if(Kind == "Block"){
			Obj = new BlockObj(this);
		}
		else if(Kind == "Diamond"){
			Obj = new DiamondObj(this);
		}
		return Obj;
	}
}
