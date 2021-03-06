package edu.nps.moves.dis7.entities.ind.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ee86bcb;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 31715
 */
public class DornierDo228201 extends EntityType
{
    /** Default constructor */
    public DornierDo228201()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 31713, Cargo/Tanker
        setSubCategory((byte)1); // uid 31714, Dornier Do 228
        setSpecific((byte)1); // uid 31715, Dornier Do 228-201
    }
}
