package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1cfd1875;
 * Country: Oman (OMN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17968
 */
public class C7ALNeemran extends EntityType
{
    /** Default constructor */
    public C7ALNeemran()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 17962, Landing Craft
        setSubCategory((byte)2); // uid 17967, LCU
        setSpecific((byte)1); // uid 17968, C7 AL Neemran
    }
}
