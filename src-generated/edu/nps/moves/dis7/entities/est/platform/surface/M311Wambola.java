package edu.nps.moves.dis7.entities.est.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@41a2befb;
 * Country: Estonia (EST);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27557
 */
public class M311Wambola extends EntityType
{
    /** Default constructor */
    public M311Wambola()
    {
        setCountry(Country.ESTONIA_EST);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27555, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 27556, Lindau Class (Type 320)
        setSpecific((byte)1); // uid 27557, M311 Wambola
    }
}
