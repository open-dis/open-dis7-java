package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ceddaf8
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 22822
 */
public class M17LightweightDecontaminationApparatus extends EntityType
{
    public M17LightweightDecontaminationApparatus()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)0); // uid 10001, Other
        setSubCategory((byte)7); // uid 22821, Decontamination Apparatus
        setSpecific((byte)1); // uid 22822, M17 Lightweight Decontamination Apparatus
    }
}