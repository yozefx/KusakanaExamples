package com.kusakana.exercise001.objects;
import com.badlogic.gdx.Input.Keys;
import com.kusakana.exercise001.animations.ShipAnim;
import com.negrorevolutio.nereengine.asm.sprites.KuASMAnimation.AnimationType;
import com.negrorevolutio.nereengine.asm.objects.KuASMObject;
import com.negrorevolutio.nereengine.asm.scenes.KuASMRegion;
public class ShipObj extends KuASMObject
{
	public ShipObj(KuASMRegion Region) {
		super(Region);
		this.Kind= "Ship";
		this.Name= "Ship";
		this.Animation= new ShipAnim(this);
		this.Animation.Creation();
		this.Animation.AnimType = AnimationType.LOOP;
		this.SetShapeMax(0);
	}

	@Override
	public void Creation()
	{
		//Generated Assignment
		this.AdventureMode = true;
		this.X = 0;
		this.Y = 0;
		this.Width = 40;
		this.Height = 40;
		this.OriginX = 20f;
		this.OriginY = 20f;
		this.ScaleX = 1f;
		this.ScaleY = 1f;
		this.SetAppearance(); 
		this.CheckingCollision = true;
		this.CheckBoundaryCollision = true;
		this.CheckShapeCollision = false;
		this.ResizeByFrame = true;
		this._Direction = Direction.RIGHT;
		this.ColorModification(255.0f/255.0f, 255.0f/255.0f, 255.0f/255.0f, 255.0f/255.0f);
		this.Zindex = 0;
		this.FlipX = false;
		this.FlipY = true;
		this.Persistent = true;
		this.Solid = true;
		this.Visible = true;
		this.VelocityX = 0f;
		this.VelocityY = 0f;
		this.Angle = 0f;
	}

	@Override
	public void Step()
	{
		//Custom code
		if(KeyboardCheck(Keys.RIGHT))
		{
			X = X+5;
		}
		if(KeyboardCheck(Keys.LEFT))
		{
			X = X-5;
		}
		if(KeyboardCheck(Keys.DOWN))
		{
			Y = Y+5;
		}
		if(KeyboardCheck(Keys.UP))
		{
			Y = Y-5;
		}
	}

	//Custom Methods
}
