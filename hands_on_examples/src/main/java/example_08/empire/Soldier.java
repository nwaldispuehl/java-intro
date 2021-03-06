package example_08.empire;

import java.awt.Image;
import java.util.Collection;

import example_08.gameboard.GameBoardElement;
import example_08.gameboard.Position;
import example_08.positionfindstrategies.RandomNextPositionStrategy;
import example_08.utils.ImageLoader;

public class Soldier extends GalacticEmpireMember {

  /*
   * Icon by Everaldo Coelho http://www.everaldo.com/, retrieved here:
   * https://www.iconfinder.com/icons/15483/clone_droid_helmet_star_wars_storm_trooper_icon
   */
  private static Image icon = new ImageLoader().loadIcon("not_the_droids/soldier.png");
  
  private static final int INITIAL_POWER = 10;
  
  public Soldier(Position position) {
    super(position);
    setPower(INITIAL_POWER);
  }

  @Override
  public Image getImage() {
    return icon;
  }

  @Override
  public Position calculateNextPosition(Collection<GameBoardElement> elements) {
    return new RandomNextPositionStrategy().findNextPosition(getCurrentPosition(), elements);
  }

}
