package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2d8f2f3a;
 * Country: Oman (OMN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17953
 */
public class B22Sadh extends EntityType
{
    /** Default constructor */
    public B22Sadh()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17942, Light/Patrol Craft
        setSubCategory((byte)3); // uid 17950, Seeb (Vosper 25) Class (inshore patrol craft)
        setSpecific((byte)3); // uid 17953, B22 Sadh
    }
}
