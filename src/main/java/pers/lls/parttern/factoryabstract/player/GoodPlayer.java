package pers.lls.parttern.abstractfactory.player;

import pers.lls.parttern.abstractfactory.cd.CD;

//具体产品，定义个性化善变的部分
public class GoodPlayer implements Player {
    @Override
    public void play(CD cd){
        cd.play();
    }
}
