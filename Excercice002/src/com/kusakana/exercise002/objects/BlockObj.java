package com.kusakana.exercise002.objects;
import com.kusakana.exercise002.animations.BlockAnim;
import com.negrorevolutio.nereengine.asm.sprites.KuASMAnimation.AnimationType;
import com.negrorevolutio.nereengine.asm.objects.KuASMObject;
import com.negrorevolutio.nereengine.asm.scenes.KuASMRegion;
public class BlockObj extends KuASMObject
{
	public BlockObj(KuASMRegion Region) {
		super(Region);
		this.Kind= "Block";
		this.Name= "Block";
		this.Animation= new BlockAnim(this);
		this.Animation.Creation();
		this.Animation.AnimType = AnimationType.LOOP;
		this.SetShapeMax(0);
	}

	@Override
	public void Creation()
	{
		//Generated Assignment
		this.AdventureMode = false;
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
		this.Persistent = false;
		this.Solid = true;
		this.Visible = true;
		this.VelocityX = 0f;
		this.VelocityY = 0f;
		this.Angle = 0f;
	}

	//Custom Methods
}
