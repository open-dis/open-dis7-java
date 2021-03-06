package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6921cfa;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 22255
 */
public class HighPowerFiberOpticTowedDecoyHPFOTD extends EntityType
{
    /** Default constructor */
    public HighPowerFiberOpticTowedDecoyHPFOTD()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 22251, Active emitter
        setSubCategory((byte)1); // uid 22252, Towed Decoy
        setSpecific((byte)3); // uid 22255, High Power Fiber Optic Towed Decoy (HPFOTD)
    }
}
