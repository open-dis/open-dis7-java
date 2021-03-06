package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@33f98231;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27106
 */
public class _702Budenovsk extends EntityType
{
    /** Default constructor */
    public _702Budenovsk()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)14); // uid 13785, Hydrofoil
        setSubCategory((byte)3); // uid 13788, Matka Class
        setSpecific((byte)2); // uid 27106, 702 Budenovsk
    }
}
