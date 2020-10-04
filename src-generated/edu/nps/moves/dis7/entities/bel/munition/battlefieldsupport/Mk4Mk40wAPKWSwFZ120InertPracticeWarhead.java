package edu.nps.moves.dis7.entities.bel.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a216eb4
 * Country: Belgium (BEL)
 * Entity kind: Munition
 * Domain: BATTLEFIELD_SUPPORT
 *
 * Entity type uid: 30312
 */
public class Mk4Mk40wAPKWSwFZ120InertPracticeWarhead extends EntityType
{
    public Mk4Mk40wAPKWSwFZ120InertPracticeWarhead()
    {
        setCountry(Country.BELGIUM_BEL);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 30309, Guided
        setSubCategory((byte)1); // uid 30310, FZ Mk4/Mk40 FFAR (70 mm, 2.75 in) w/APKWS
        setSpecific((byte)2); // uid 30312, Mk4/Mk40 w/APKWS w/ FZ120 Inert Practice Warhead
    }
}
