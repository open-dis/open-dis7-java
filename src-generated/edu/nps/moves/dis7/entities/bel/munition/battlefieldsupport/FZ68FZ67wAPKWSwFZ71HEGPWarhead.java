package edu.nps.moves.dis7.entities.bel.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@764a3e5d;
 * Country: Belgium (BEL);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 30318
 */
public class FZ68FZ67wAPKWSwFZ71HEGPWarhead extends EntityType
{
    /** Default constructor */
    public FZ68FZ67wAPKWSwFZ71HEGPWarhead()
    {
        setCountry(Country.BELGIUM_BEL);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 30309, Guided
        setSubCategory((byte)2); // uid 30317, FZ FZ68/FZ67 FFAR (70 mm, 2.75 in) w/APKWS
        setSpecific((byte)1); // uid 30318, FZ68/FZ67 w/APKWS w/ FZ71 HEGP Warhead
    }
}
