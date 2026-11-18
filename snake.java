private final LinkedList<Point> body = new LinkedList<>();
private Direction direction = Direction.RIGHT;

public void reset(int startX, int startY); {
  body.clear();
  body.add(new Point(startX, startY)); //Cabeca
  body.add(new Point(startX - 1, startY)); //corpo
  body.add(new Point(startX - 2, startY)); //Cauda
  direction = Direciton.RIGHT;
}
public LinkedList<Point> getBody() {
  return direction;
}
  public Direction getDirection() {
    return direction;
  }
