package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@490d6c15;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29375
 */
public class DDG39Hobart extends EntityType
{
    /** Default constructor */
    public DDG39Hobart()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 29373, Guided Missile Destroyer (DDG)
        setSubCategory((byte)1); // uid 29374, Hobart Class
        setSpecific((byte)1); // uid 29375, DDG 39 Hobart
    }
}
