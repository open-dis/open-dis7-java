package edu.nps.moves.dis7.entities.fin.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58a9760d;
 * Country: Finland (FIN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29712
 */
public class _81Tornio extends EntityType
{
    /** Default constructor */
    public _81Tornio()
    {
        setCountry(Country.FINLAND_FIN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 29709, Fast Attack Craft
        setSubCategory((byte)1); // uid 29710, Hamina Class Missile Boat
        setSpecific((byte)2); // uid 29712, 81 Tornio
    }
}
