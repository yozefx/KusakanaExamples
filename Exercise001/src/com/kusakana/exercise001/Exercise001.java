package com.kusakana.exercise001;
import com.kusakana.exercise001.assets.KuGlobal;
import com.kusakana.exercise001.scenes.WorldScn;
import com.negrorevolutio.nereengine.KidBrain;
import com.negrorevolutio.nereengine.KidEye;
import com.negrorevolutio.nereengine.KidHand;
import com.negrorevolutio.nereengine.Kusakana;
public class Exercise001 extends Kusakana 
{
	@Override
	public void Assets()
	{
		this.Asset = new KuGlobal();
		((KuGlobal)Asset).CreateShipAst();
	}
	@Override
	public void InitMainScene()
	{
		KidBrain.DebugPaper = false;
		KidHand.CollisionByDepthEnabled = false;
		Kid.Eyes.ViewportWidth = 800;
		Kid.Eyes.ViewportHeight = 480;
		Kid.Eyes.WithDelay = false;
		Kid.Eyes.Speed = 1f;
		KidEye.UsingSceneRulers = true;
		Kid.Eyes.Reframe(800, 480);
		Kid.Eyes.MarginX = 0;
		Kid.Eyes.MarginY = 0;
		Kid.Eyes.Perception.zoom = 1f;
		this.MainScene = new WorldScn(this);
		this.MainScene.Depthi = 1;
		Kid.Eyes.SetAppearance();
	}
	@Override
	public void Misc()
	{
		if(this.Asset == null)return;
	}
}
