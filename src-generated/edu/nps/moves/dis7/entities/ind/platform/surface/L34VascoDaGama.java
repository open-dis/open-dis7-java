package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4748a0f9;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18866
 */
public class L34VascoDaGama extends EntityType
{
    /** Default constructor */
    public L34VascoDaGama()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 18862, Amphibious Assault Ship
        setSubCategory((byte)2); // uid 18865, Mk 3 Landing Craft (LCU/LSM)
        setSpecific((byte)1); // uid 18866, L34 Vasco Da Gama
    }
}
