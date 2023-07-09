# Zadanie 9.
Stwórz klasę `Point2D` posiadającą pola `double x`, `double y`, gettery, settery oraz konstruktor. 
Następnie stwórz klasę `Circle`, która będzie miała konstruktor:
`Circle(Point2D center, Point2D point)`
Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu. Na podstawie tych
punktów, klasa Circle ma określać:
* promień okręgu przy wywołaniu metody double getRadius() (√(x2−x1)^2+(y2−y1)^2)
* obwód okręgu przy wywołaniu metody double getPerimeter()
* pole okręgu przy wywołaniu metody double getArea()
* *(trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody `List<Point2D> getSlicePoints()`