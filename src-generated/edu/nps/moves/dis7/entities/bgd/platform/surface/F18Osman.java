package edu.nps.moves.dis7.entities.bgd.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4cb2c100;
 * Country: Bangladesh (BGD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26773
 */
public class F18Osman extends EntityType
{
    /** Default constructor */
    public F18Osman()
    {
        setCountry(Country.BANGLADESH_BGD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 26771, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 26772, Jianghu-II Class (Type 053H1)
        setSpecific((byte)1); // uid 26773, F18 Osman
    }
}
