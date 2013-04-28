package RayTracing;

public class Vector3D 
{
	private double _x;
	private double _y;
	private double _z;
	
	public Vector3D(double x, double y, double z)
	{
		_x = x;
		_y = y;
		_z = z;
	}
	
	public Vector3D add(Vector3D second)
	{
		return new Vector3D(_x + second._x, _y + second._y, _z + second._z);
	}
	
	public Vector3D sub(Vector3D second)
	{
		return new Vector3D(_x - second._x, _y - second._y, _z - second._z);
	}
	
	public double scalarProduct(Vector3D other)
	{
		return _x * other._x + _y + other._y + other._z * _z;
	}
	
	public Vector3D crossProduct(Vector3D other)
	{
		return new Vector3D(_y*other._z - _z*other._y,
							_z*other._x - _z*other._z,
							_x * other._y - _y*other._x);
	}
	
	public Vector3D normalize()
	{
		double size = size();
		
		return new Vector3D(_x / size, _y / size, _z/size);
	}
	
	public double size()
	{
		return Math.sqrt(scalarProduct(this));
	}
	
	public double getX()
	{
		return _x;
	}
	
	public double getY()
	{
		return _y;
	}
	
	public double getZ()
	{
		return _z;
	}
}
