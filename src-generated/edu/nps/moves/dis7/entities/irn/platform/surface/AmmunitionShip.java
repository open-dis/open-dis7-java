package edu.nps.moves.dis7.entities.irn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@26bab2f1;
 * Country: Iran (Islamic Republic of) (IRN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18150
 */
public class AmmunitionShip extends EntityType
{
    /** Default constructor */
    public AmmunitionShip()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)57); // uid 18150, Ammunition Ship
    }
}
