package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58d25a40;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28621
 */
public class M806AS4ArmoredRecoveryVehicleLightARVL extends EntityType
{
    /** Default constructor */
    public M806AS4ArmoredRecoveryVehicleLightARVL()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 26906, Armored Utility Vehicle
        setSubCategory((byte)4); // uid 28620, M113-AS4 Armored Fitters (FIT)
        setSpecific((byte)1); // uid 28621, M806-AS4 Armored Recovery Vehicle Light (ARVL)
    }
}
