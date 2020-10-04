package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1deb2c43
 * Country: Oman (OMN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17956
 */
public class B10Dhofar extends EntityType
{
    public B10Dhofar()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17942, Light/Patrol Craft
        setSubCategory((byte)4); // uid 17955, Dhofar (Province) Class (fast attack craft-missile)
        setSpecific((byte)1); // uid 17956, B10 Dhofar
    }
}
