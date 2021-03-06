package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@543295b0;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16016
 */
public class L9022Orage extends EntityType
{
    /** Default constructor */
    public L9022Orage()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 16011, Dock Landing Ship
        setSubCategory((byte)2); // uid 16014, Ouragan class (TCDs)
        setSpecific((byte)2); // uid 16016, L 9022 Orage
    }
}
