class Car
{
  static int ObjectCount=0;
  int year;
  Car(int y)
  {
    year =y;
    ObjectCount++;
  }
  int getYear()
  {
    return year;
  }
  static int getObjectCount()
  {
    return ObjectCount;
  }

}