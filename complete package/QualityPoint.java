class QualityPoint {

  public int qualityPoints(float mark) {

    if (mark >= 99 && mark <= 100)
      return 4;
    else if (mark >= 80 && mark <= 89)
      return 3;
    else if (mark >= 70 && mark <= 79)
      return 2;
    else if (mark >= 60 && mark <= 69)
      return 1;
    else if (mark < 60)
      return 0;
    return -1;

  }
}