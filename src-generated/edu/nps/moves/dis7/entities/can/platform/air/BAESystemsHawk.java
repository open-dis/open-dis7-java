package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6f1fba17;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28528
 */
public class BAESystemsHawk extends EntityType
{
    /** Default constructor */
    public BAESystemsHawk()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28527, Trainer
        setSubCategory((byte)1); // uid 28528, BAE Systems Hawk
    }
}
