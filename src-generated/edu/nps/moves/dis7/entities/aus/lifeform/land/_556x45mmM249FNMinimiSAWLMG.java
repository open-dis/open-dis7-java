package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a04ca74;
 * Country: Australia (AUS);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 31494
 */
public class _556x45mmM249FNMinimiSAWLMG extends EntityType
{
    /** Default constructor */
    public _556x45mmM249FNMinimiSAWLMG()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 31462, Australian Army
        setSubCategory((byte)35); // uid 31493, Machine Guns
        setSpecific((byte)20); // uid 31494, 5.56x45mm M249/FN Minimi SAW/LMG
    }
}
