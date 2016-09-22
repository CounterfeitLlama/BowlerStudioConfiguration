import eu.mihosoft.vrl.v3d.parametrics.*;

CSG makePart() {
	LengthParameter thickness = new LengthParameter("Material Thickness",3.15,[10,1]);

	CSG cube = new Cube(40, 60, thickness.getMM()).toCSG()
	cube.setParameter(thickness)
	cube.setRegenerate({
		return makePart()
	})
	return cube
}

return makePart()