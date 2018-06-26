package com.lyuben.primavera.domain.product;

import javax.persistence.Basic;
import javax.persistence.FetchType;

public class Hookah {

    @Basic(fetch = FetchType.EAGER)
    Crown crown;

    @Basic(fetch = FetchType.EAGER)
    Mouthpiece mouthpiece;

    @Basic(fetch = FetchType.EAGER)
    Bowl bowl;

    @Basic(fetch = FetchType.EAGER)
    Hose hose;

    @Basic(fetch = FetchType.EAGER, optional = false)
    Vase vase;

    @Basic(fetch = FetchType.EAGER, optional = false)
    Basepiece basepiece;

}
