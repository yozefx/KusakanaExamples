package com.kusakana.exercise001;
import com.kusakana.exercise001.scenes.WorldScn;
import com.negrorevolutio.nereengine.asm.scenes.KuASMRegion;
import com.negrorevolutio.nereengine.Kusakana;
import com.negrorevolutio.nereengine.asm.scenes.KuASMScene;
public abstract class KuMasterScene extends KuASMScene
{
	public KuMasterScene(Kusakana Game){super(Game);}
	@Override
	public void GotoNextScene(String Scene)
	{
		KuASMScene MainScene = null;
		KuASMScene DeprecatedScene = null;
		Kid.Brain.PreviousSceneName = Game.MainScene.Name;
		DeprecatedScene = Game.MainScene;
		if(Scene == "World")
		{
			MainScene = new WorldScn(Game);
			MainScene.Depthi = 2;
		}
		if(MainScene != null)
		{
			MainScene.DeprecatedScene = DeprecatedScene;
			DeprecatedScene.OnSceneEnd();
			if(DeprecatedScene != null){
				if(DeprecatedScene.RegionMap != null){
					for(int i = 0; i<DeprecatedScene.RegionMap.size; ++i)
					{
						KuASMRegion Region = DeprecatedScene.RegionMap.get(i);
						if(Region == null)continue;
						if(Region.Activated){
							Region.SceneEnd(); 
						}
					}
				}
			}
			MainScene.ReinitDepth(MainScene.Depthi);
			Game.setScreen(MainScene);
		}
	}
	@Override
	public void Assets() {}
	@Override
	public void DisposeAssets() {}
}
